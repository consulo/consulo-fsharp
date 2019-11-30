/*
 * Copyright 2013-2016 consulo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package consulo.fsharp.module.extension;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.psi.PsiElement;
import consulo.annotation.access.RequiredReadAction;
import consulo.dotnet.module.extension.DotNetModuleLangExtension;
import consulo.fsharp.FSharpFileType;
import consulo.module.extension.ModuleExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author VISTALL
 * @since 12.06.2015
 */
public interface FSharpModuleExtension<T extends FSharpModuleExtension<T>> extends ModuleExtension<T>, DotNetModuleLangExtension<T>
{
	@RequiredReadAction
	@NotNull
	@Override
	default PsiElement[] getEntryPointElements()
	{
		return PsiElement.EMPTY_ARRAY; //TODO [VISTALL] resolve main methods
	}

	@RequiredReadAction
	@Nullable
	@Override
	default String getAssemblyTitle()
	{
		return null; //TODO [VISTALL] resolve from AssemblyInfo.fs
	}

	@NotNull
	@Override
	default LanguageFileType getFileType()
	{
		return FSharpFileType.INSTANCE;
	}
}
