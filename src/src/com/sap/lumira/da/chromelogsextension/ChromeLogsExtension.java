/*
Copyright 2015, SAP SE

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.sap.lumira.da.chromelogsextension;

import java.util.EnumSet;
import java.util.Set;

import com.sap.bi.da.extension.sdk.DAEWorkflow;
import com.sap.bi.da.extension.sdk.DAException;
import com.sap.bi.da.extension.sdk.IDAEAcquisitionJobContext;
import com.sap.bi.da.extension.sdk.IDAEAcquisitionState;
import com.sap.bi.da.extension.sdk.IDAEClientRequestJob;
import com.sap.bi.da.extension.sdk.IDAEDataAcquisitionJob;
import com.sap.bi.da.extension.sdk.IDAEEnvironment;
import com.sap.bi.da.extension.sdk.IDAEMetadataAcquisitionJob;
import com.sap.bi.da.extension.sdk.IDAEProgress;
import com.sap.bi.da.extension.sdk.IDAExtension;

/**
 * The main class of the extension
 */
public class ChromeLogsExtension implements IDAExtension {

	public ChromeLogsExtension() {

	}

	@Override
	public void initialize(IDAEEnvironment environment) {
		// This function will be called when the extension is initially loaded
		// This gives the extension to perform initialization steps, according
		// to the provided environment
	}

	@Override
	public IDAEAcquisitionJobContext getDataAcquisitionJobContext(IDAEAcquisitionState acquisitionState) {
		return new CLEAcquisitionJobContext(acquisitionState);
	}

	@Override
	public IDAEClientRequestJob getClientRequestJob(String request) {
		return new CLEClientRequestJob(request);
	}

	private static class CLEAcquisitionJobContext implements IDAEAcquisitionJobContext {

		private IDAEAcquisitionState acquisitionState;

		CLEAcquisitionJobContext(IDAEAcquisitionState acquisitionState) {
			this.acquisitionState = acquisitionState;
		}

		@Override
		public IDAEMetadataAcquisitionJob getMetadataAcquisitionJob() {
			return new CLEMetadataRequestJob(acquisitionState);
		}

		@Override
		public IDAEDataAcquisitionJob getDataAcquisitionJob() {
			return new CLEDataRequestJob(acquisitionState);
		}

		@Override
		public void cleanup() {
			// Called once acquisition is complete
			// Provides the job the opportunity to perform cleanup, if needed
			// Will be called after both job.cleanup()'s are called
		}
	}

	/**
	 * This class is retained from the sample DA and not used in the current
	 * implementation. Anyone looking to modify the current implementation to
	 * make a client request can use this if required.
	 */
	private class CLEClientRequestJob implements IDAEClientRequestJob {

		String request;

		CLEClientRequestJob(String request) {
			this.request = request;
		}

		@Override
		public String execute(IDAEProgress callback) throws DAException {
			return null;
		}

		@Override
		public void cancel() {
			// Cancel is currently not supported
		}

		@Override
		public void cleanup() {
			// This function is NOT called
		}

	}

	@Override
	public Set<DAEWorkflow> getEnabledWorkflows(IDAEAcquisitionState acquisitionState) {
		// If the extension is incompatible with the current environment, it may
		// disable itself using this function
		// return EnumSet.allOf(DAEWorkflow.class) to enable the extension
		// return EnumSet.noneOf(DAEWorkflow.class) to disable the extension
		// Partial enabling is not currently supported
		return EnumSet.allOf(DAEWorkflow.class);
	}
}
