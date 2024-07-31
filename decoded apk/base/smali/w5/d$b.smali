.class public final Lw5/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lw5/d$b;->c:Z

    return v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lw5/d$b;->b:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lw5/d$b;->a:J

    return-wide v0
.end method

.method public final d(Z)V
    .locals 0

    iput-boolean p1, p0, Lw5/d$b;->c:Z

    return-void
.end method

.method public final e(J)V
    .locals 0

    iput-wide p1, p0, Lw5/d$b;->b:J

    return-void
.end method

.method public final f(J)V
    .locals 0

    iput-wide p1, p0, Lw5/d$b;->a:J

    return-void
.end method
