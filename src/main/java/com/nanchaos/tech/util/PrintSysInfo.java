package com.nanchaos.tech.util;

import jdk.nashorn.internal.objects.annotations.Function;
import org.slf4j.Logger;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/1
 * @time 10:59
 */
public interface PrintSysInfo {

    String getSysInfo();

    int getLogHashCode();

    Logger getLogger();
}
