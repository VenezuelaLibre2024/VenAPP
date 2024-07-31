.class final Lh7/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lh7/i$a;)V
    .locals 0

    invoke-direct {p0}, Lh7/i$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly6/l;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public b()Ly6/z;
    .locals 3

    new-instance v0, Ly6/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ly6/z$b;-><init>(J)V

    return-object v0
.end method

.method public c(J)V
    .locals 0

    return-void
.end method
