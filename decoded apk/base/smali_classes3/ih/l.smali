.class public Lih/l;
.super Lih/f;
.source "SourceFile"


# instance fields
.field private c:Z


# direct methods
.method public constructor <init>(Ldg/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lih/f;-><init>(Ldg/o;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lih/l;->c:Z

    return-void
.end method


# virtual methods
.method protected e(Ldg/j;)Ldg/c;
    .locals 2

    iget-boolean v0, p0, Lih/l;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lih/l;->c:Z

    new-instance v0, Ldg/c;

    new-instance v1, Lkg/m;

    invoke-virtual {p1}, Ldg/j;->e()Ldg/j;

    move-result-object p1

    invoke-direct {v1, p1}, Lkg/m;-><init>(Ldg/j;)V

    invoke-direct {v0, v1}, Ldg/c;-><init>(Ldg/b;)V

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lih/l;->c:Z

    new-instance v0, Ldg/c;

    new-instance v1, Lkg/m;

    invoke-direct {v1, p1}, Lkg/m;-><init>(Ldg/j;)V

    invoke-direct {v0, v1}, Ldg/c;-><init>(Ldg/b;)V

    return-object v0
.end method
