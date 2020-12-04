package com.txl.tinkerlearn.app;

/**
 * Copyright (c) 2020 唐小陆 All rights reserved.
 * author：txl
 * date：2020/12/4
 * description：
 */
@DefaultLifeCycle(
        application = "com.txl.tinkerlearn.app.SampleApplication",             //application name to generate
        flags = ShareConstants.TINKER_ENABLE_ALL)
public class MyApplicationLike extends DefaultApplicationLike{
}
