.class public Lih/k;
.super Lih/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ldg/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lih/f;-><init>(Ldg/o;)V

    return-void
.end method


# virtual methods
.method protected e(Ldg/j;)Ldg/c;
    .locals 2

    new-instance v0, Ldg/c;

    new-instance v1, Lkg/m;

    invoke-virtual {p1}, Ldg/j;->e()Ldg/j;

    move-result-object p1

    invoke-direct {v1, p1}, Lkg/m;-><init>(Ldg/j;)V

    invoke-direct {v0, v1}, Ldg/c;-><init>(Ldg/b;)V

    return-object v0
.end method
