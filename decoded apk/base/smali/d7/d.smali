.class public final Ld7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/m;


# instance fields
.field private final a:J

.field private final b:Ly6/m;


# direct methods
.method public constructor <init>(JLy6/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld7/d;->a:J

    iput-object p3, p0, Ld7/d;->b:Ly6/m;

    return-void
.end method

.method static synthetic a(Ld7/d;)J
    .locals 2

    iget-wide v0, p0, Ld7/d;->a:J

    return-wide v0
.end method


# virtual methods
.method public d(II)Ly6/b0;
    .locals 1

    iget-object v0, p0, Ld7/d;->b:Ly6/m;

    invoke-interface {v0, p1, p2}, Ly6/m;->d(II)Ly6/b0;

    move-result-object p1

    return-object p1
.end method

.method public p(Ly6/z;)V
    .locals 2

    iget-object v0, p0, Ld7/d;->b:Ly6/m;

    new-instance v1, Ld7/d$a;

    invoke-direct {v1, p0, p1}, Ld7/d$a;-><init>(Ld7/d;Ly6/z;)V

    invoke-interface {v0, v1}, Ly6/m;->p(Ly6/z;)V

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Ld7/d;->b:Ly6/m;

    invoke-interface {v0}, Ly6/m;->q()V

    return-void
.end method
