.class public final Lde/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lde/k;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lde/l;
    .locals 1

    invoke-static {}, Lde/l$a;->a()Lde/l;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lde/k;
    .locals 1

    new-instance v0, Lde/k;

    invoke-direct {v0}, Lde/k;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lde/k;
    .locals 1

    invoke-static {}, Lde/l;->c()Lde/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lde/l;->b()Lde/k;

    move-result-object v0

    return-object v0
.end method
