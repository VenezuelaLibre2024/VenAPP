.class public final Lud/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lud/k;
    .locals 1

    invoke-static {}, Lud/k$a;->a()Lud/k;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lud/j;
    .locals 1

    new-instance v0, Lud/j;

    invoke-direct {v0}, Lud/j;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lud/j;
    .locals 1

    invoke-static {}, Lud/k;->c()Lud/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/k;->b()Lud/j;

    move-result-object v0

    return-object v0
.end method
