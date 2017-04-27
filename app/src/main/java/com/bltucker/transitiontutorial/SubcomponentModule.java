package com.bltucker.transitiontutorial;


import com.bltucker.transitiontutorial.teamdetail.TeamDetailFragmentComponent;
import com.bltucker.transitiontutorial.teamlist.TeamListFragmentComponent;

import dagger.Module;

@Module(subcomponents = {TeamListFragmentComponent.class,
    TeamDetailFragmentComponent.class})
class SubcomponentModule {
}
