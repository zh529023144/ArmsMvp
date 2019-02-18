/*
 * Copyright 2017 JessYan
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
package com.xinghuo.module_map.di;

import com.jess.xinghuo.di.component.BaseComponent;
import com.jess.xinghuo.di.scope.AppScope;
import com.xinghuo.commonlib.app.di.CommonModule;
import com.xinghuo.module_map.app.AppDelegate;


import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        CommonModule.class,
        MapModule.class,

}, dependencies = BaseComponent.class)
public interface MapComponent {
    void inject(AppDelegate delegate);
//    ApiServiceHelper getApiServiceHelper();
}
