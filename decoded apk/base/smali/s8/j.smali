.class public interface abstract Ls8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/j$a;
    }
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public abstract getUri()Landroid/net/Uri;
.end method

.method public abstract l(Ls8/m0;)V
.end method

.method public abstract o(Ls8/n;)J
.end method
