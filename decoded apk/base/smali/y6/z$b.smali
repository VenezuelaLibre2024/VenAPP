.class public Ly6/z$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly6/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Ly6/z$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Ly6/z$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly6/z$b;->a:J

    new-instance p1, Ly6/z$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, Ly6/a0;->c:Ly6/a0;

    goto :goto_0

    :cond_0
    new-instance p2, Ly6/a0;

    invoke-direct {p2, v0, v1, p3, p4}, Ly6/a0;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2}, Ly6/z$a;-><init>(Ly6/a0;)V

    iput-object p1, p0, Ly6/z$b;->b:Ly6/z$a;

    return-void
.end method


# virtual methods
.method public d(J)Ly6/z$a;
    .locals 0

    iget-object p1, p0, Ly6/z$b;->b:Ly6/z$a;

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Ly6/z$b;->a:J

    return-wide v0
.end method
