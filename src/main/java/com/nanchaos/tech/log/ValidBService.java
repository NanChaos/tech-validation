package com.nanchaos.tech.log;

import com.nanchaos.tech.util.PrintSysInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Default Description
 *
 * @author nanchaos
 * @date 2025/1/1
 * @time 10:58
 */
@Slf4j
@Service
public class ValidBService implements PrintSysInfo {

    @Override
    public String getSysInfo() {
        return log.toString();
    }

    @Override
    public int getLogHashCode() {
        return log.hashCode();
    }
}
