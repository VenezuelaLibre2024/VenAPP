.class public final Lud/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/h$a;
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

.method public static a()Lud/h;
    .locals 1

    invoke-static {}, Lud/h$a;->a()Lud/h;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lud/g;
    .locals 1

    new-instance v0, Lud/g;

    invoke-direct {v0}, Lud/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lud/g;
    .locals 1

    invoke-static {}, Lud/h;->c()Lud/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lud/h;->b()Lud/g;

    move-result-object v0

    return-object v0
.end method
