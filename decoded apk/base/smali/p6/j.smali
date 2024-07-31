.class public final Lp6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lp6/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lp6/j;
    .locals 1

    invoke-static {}, Lp6/j$a;->a()Lp6/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lp6/e;
    .locals 2

    invoke-static {}, Lp6/f;->d()Lp6/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lj6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp6/e;

    return-object v0
.end method


# virtual methods
.method public b()Lp6/e;
    .locals 1

    invoke-static {}, Lp6/j;->c()Lp6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp6/j;->b()Lp6/e;

    move-result-object v0

    return-object v0
.end method
