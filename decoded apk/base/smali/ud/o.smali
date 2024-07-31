.class public final Lud/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/o$a;
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

.method public static a()Lud/o;
    .locals 1

    invoke-static {}, Lud/o$a;->a()Lud/o;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lud/n;
    .locals 1

    new-instance v0, Lud/n;

    invoke-direct {v0}, Lud/n;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lud/n;
    .locals 1

    invoke-static {}, Lud/o;->c()Lud/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/o;->b()Lud/n;

    move-result-object v0

    return-object v0
.end method
