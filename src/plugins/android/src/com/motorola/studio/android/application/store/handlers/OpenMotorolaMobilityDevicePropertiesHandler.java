/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.motorola.studio.android.application.store.handlers;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

import com.motorola.studio.android.common.log.StudioLogger;

public class OpenMotorolaMobilityDevicePropertiesHandler extends AbstractHandler
{
    private static final String URL_STRING = "http://developer.motorola.com/products/";

    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();

        /*
         * open the browser
         */
        IWebBrowser browser;
        try
        {
            browser =
                    browserSupport.createBrowser(IWorkbenchBrowserSupport.LOCATION_BAR
                            | IWorkbenchBrowserSupport.NAVIGATION_BAR
                            | IWorkbenchBrowserSupport.AS_EXTERNAL, "MOTODEV", null, null);

            browser.openURL(new URL(URL_STRING));

        }
        catch (PartInitException e)
        {
            StudioLogger.error("Error opening the Motorola products page: " + e.getMessage());
        }
        catch (MalformedURLException e)
        {
            StudioLogger.error("Error opening the Motorola products page: " + e.getMessage());
        }
        return null;
    }

}
