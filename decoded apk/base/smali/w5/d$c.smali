.class public final Lw5/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lw5/d$c;->e:Z

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lw5/d$c;->d:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lw5/d$c;->b:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lw5/d$c;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lw5/d$c;->a:I

    return v0
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Lw5/d$c;->e:Z

    return-void
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lw5/d$c;->d:I

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lw5/d$c;->b:I

    return-void
.end method

.method public final i(I)V
    .locals 0

    iput p1, p0, Lw5/d$c;->c:I

    return-void
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, Lw5/d$c;->a:I

    return-void
.end method
