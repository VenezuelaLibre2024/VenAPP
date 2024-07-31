.class public final Lbe/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrd/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrd/b<",
        "Ldj/r;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lbe/n0;


# direct methods
.method public constructor <init>(Lbe/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/p0;->a:Lbe/n0;

    return-void
.end method

.method public static a(Lbe/n0;)Lbe/p0;
    .locals 1

    new-instance v0, Lbe/p0;

    invoke-direct {v0, p0}, Lbe/p0;-><init>(Lbe/n0;)V

    return-object v0
.end method

.method public static c(Lbe/n0;)Ldj/r;
    .locals 0

    invoke-virtual {p0}, Lbe/n0;->b()Ldj/r;

    move-result-object p0

    invoke-static {p0}, Lrd/d;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldj/r;

    return-object p0
.end method


# virtual methods
.method public b()Ldj/r;
    .locals 1

    iget-object v0, p0, Lbe/p0;->a:Lbe/n0;

    invoke-static {v0}, Lbe/p0;->c(Lbe/n0;)Ldj/r;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbe/p0;->b()Ldj/r;

    move-result-object v0

    return-object v0
.end method
