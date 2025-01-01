package com.nanchaos.tech.util;

import jdk.nashorn.internal.objects.annotations.Function;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/1
 * @time 10:59
 */
public interface PrintSysInfo {

    String getSysInfo();

    default String sysInfo() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    int getLogHashCode();
}
