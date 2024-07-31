.class public final Loc/e;
.super Lcom/google/firebase/auth/w;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/firebase/auth/w;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Loc/e;->c:Z

    iput-boolean v0, p0, Loc/e;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Loc/e;->d:Z

    return-void
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Loc/e;->c:Z

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Loc/e;->a:Ljava/lang/String;

    iput-object p2, p0, Loc/e;->b:Ljava/lang/String;

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loc/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Loc/e;->d:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Loc/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Loc/e;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Loc/e;->c:Z

    return v0
.end method
