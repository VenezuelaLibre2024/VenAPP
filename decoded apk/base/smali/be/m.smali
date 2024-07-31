.class public final Lbe/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Lnd/d;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/k;


# direct methods
.method public constructor <init>(Lbe/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/m;->a:Lbe/k;

    return-void
.end method

.method public static a(Lbe/k;)Lbe/m;
    .locals 1

    new-instance v0, Lbe/m;

    invoke-direct {v0, p0}, Lbe/m;-><init>(Lbe/k;)V

    return-object v0
.end method

.method public static c(Lbe/k;)Lnd/d;
    .locals 0

    invoke-virtual {p0}, Lbe/k;->b()Lnd/d;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnd/d;

    return-object p0
.end method


# virtual methods
.method public b()Lnd/d;
    .locals 1

    iget-object v0, p0, Lbe/m;->a:Lbe/k;

    invoke-static {v0}, Lbe/m;->c(Lbe/k;)Lnd/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/m;->b()Lnd/d;

    move-result-object v0

    return-object v0
.end method
