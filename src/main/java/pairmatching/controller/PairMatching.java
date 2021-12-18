package pairmatching.controller;

import static pairmatching.enums.ErrorMessage.*;
import static pairmatching.view.InputView.*;
import static pairmatching.view.OutputView.*;

import pairmatching.enums.FeatureEnum;
import pairmatching.service.PairMatchingService;

public class PairMatching {
	private PairMatchingService pairMatchingService;

	public PairMatching() {
		pairMatchingService = new PairMatchingService();
	}

	public void executeFeature() {
		String feature = inputExecuteFeature().getMessage();
		if (FeatureEnum.PAIR_MATCHING.isSame(feature)) {
			pairMatching();
		}
		if (FeatureEnum.PAIR_SEARCH.isSame(feature)) {
			pairSearch();
		}
		if (FeatureEnum.PAIR_INITIALIZE.isSame(feature)) {
			pairInitialize();
		}
		if (FeatureEnum.EXIT.isSame(feature)) {
			return;
		}
		throw new IllegalArgumentException(INPUT_EXECUTE_FEATURE_ERROR.get());
	}

	private void pairMatching() {
		outputCourseAndLevel();
	}

	private void pairSearch() {
		outputCourseAndLevel();
	}

	private void pairInitialize() {
	}
}
