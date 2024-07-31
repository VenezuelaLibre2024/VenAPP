.class public final Lr6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr6/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj6/b<",
        "Lr6/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lr6/d;
    .locals 1

    invoke-static {}, Lr6/d$a;->a()Lr6/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lr6/a;
    .locals 2

    invoke-static {}, Lr6/b;->b()Lr6/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Lj6/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/a;

    return-object v0
.end method


# virtual methods
.method public b()Lr6/a;
    .locals 1

    invoke-static {}, Lr6/d;->c()Lr6/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr6/d;->b()Lr6/a;

    move-result-object v0

    return-object v0
.end method
