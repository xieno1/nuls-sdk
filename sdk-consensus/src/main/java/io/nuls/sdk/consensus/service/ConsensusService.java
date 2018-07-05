package io.nuls.sdk.consensus.service;


import io.nuls.sdk.accountledger.model.Input;
import io.nuls.sdk.consensus.model.AgentInfo;
import io.nuls.sdk.core.model.Result;

import java.util.List;

public interface ConsensusService {

    Result createAgentTransaction(AgentInfo agent, List<Input> inputs);
}
