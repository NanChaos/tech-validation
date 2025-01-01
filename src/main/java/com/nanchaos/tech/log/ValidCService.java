package com.nanchaos.tech.log;

import com.nanchaos.tech.util.PrintSysInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/1
 * @time 10:58
 */
@Service
public class ValidCService implements PrintSysInfo {

    private final static Logger log = LoggerFactory.getLogger(ValidCService.class);

    @Override
    public String getSysInfo() {
        return log.toString();
    }

    @Override
    public int getLogHashCode() {
        return log.hashCode();
    }
}
