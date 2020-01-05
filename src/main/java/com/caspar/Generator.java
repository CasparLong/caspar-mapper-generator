package com.caspar;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Caspar
 * @since 2020/1/5 15:22
 */
public class Generator {

    private static final String GENERATOR_CONFIG_PATH = "generatorConfig.xml";

    public static void main(String[] args) throws Exception {
        generate();
    }

    /**
     * generate
     *
     * @throws Exception
     */
    private static void generate() throws Exception {
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration config = cp.parseConfiguration(Thread.currentThread().getContextClassLoader().getResourceAsStream(GENERATOR_CONFIG_PATH));
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }


}
