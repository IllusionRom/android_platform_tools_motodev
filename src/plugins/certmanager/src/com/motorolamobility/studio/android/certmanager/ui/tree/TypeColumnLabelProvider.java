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
package com.motorolamobility.studio.android.certmanager.ui.tree;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import com.motorolamobility.studio.android.certmanager.ui.model.IKeyStore;

public class TypeColumnLabelProvider extends ColumnLabelProvider
{

    /* (non-Javadoc)
     * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
     */
    @Override
    public String getText(Object element)
    {
        if (element instanceof IKeyStore)
        {
            IKeyStore iKeyStore = (IKeyStore) element;
            return iKeyStore.getType();
        }
        return ""; //other items do not need to show this column with data
    }

}
