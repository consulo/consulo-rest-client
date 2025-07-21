package org.javamaster.httpclient.highlighting;

import consulo.annotation.component.ExtensionImpl;
import consulo.codeEditor.EditorHighlighter;
import consulo.colorScheme.EditorColorsScheme;
import consulo.language.editor.highlight.EditorHighlighterProvider;
import consulo.project.Project;
import consulo.virtualFileSystem.VirtualFile;
import consulo.virtualFileSystem.fileType.FileType;
import jakarta.annotation.Nonnull;
import org.javamaster.httpclient.HttpFileType;
import org.javamaster.httpclient.highlighting.support.HttpHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExtensionImpl
public class HttpHighlighterProvider implements EditorHighlighterProvider {

    public EditorHighlighter getEditorHighlighter(@Nullable Project project, @NotNull FileType fileType,
                                                  @Nullable VirtualFile virtualFile, @NotNull EditorColorsScheme colors) {
        return new HttpHighlighter(colors);
    }

    @Nonnull
    @Override
    public FileType getFileType() {
        return HttpFileType.INSTANCE;
    }
}
