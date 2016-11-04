package org.bahmni.gauge.possible.program;

import com.thoughtworks.gauge.Table;
import org.bahmni.gauge.common.program.ProgramManagementPage;
import org.bahmni.gauge.common.program.domain.Program;

import static org.bahmni.gauge.util.TableTransformer.asEntity;

public class PossibleProgramManagementPage extends ProgramManagementPage {

    public Program transformTableToProgram(Table programDetails){
        return asEntity(programDetails,Program.class);
    }
}
