.class public final Lud/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/d$a;
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

.method public static a()Lud/d;
    .locals 1

    invoke-static {}, Lud/d$a;->a()Lud/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lud/c;
    .locals 1

    new-instance v0, Lud/c;

    invoke-direct {v0}, Lud/c;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lud/c;
    .locals 1

    invoke-static {}, Lud/d;->c()Lud/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/d;->b()Lud/c;

    move-result-object v0

    return-object v0
.end method
