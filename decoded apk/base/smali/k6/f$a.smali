.class public final Lk6/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk6/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lk6/f$a;->a:J

    iput-wide v0, p0, Lk6/f$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lk6/f;
    .locals 5

    new-instance v0, Lk6/f;

    iget-wide v1, p0, Lk6/f$a;->a:J

    iget-wide v3, p0, Lk6/f$a;->b:J

    invoke-direct {v0, v1, v2, v3, v4}, Lk6/f;-><init>(JJ)V

    return-object v0
.end method

.method public b(J)Lk6/f$a;
    .locals 0

    iput-wide p1, p0, Lk6/f$a;->b:J

    return-object p0
.end method

.method public c(J)Lk6/f$a;
    .locals 0

    iput-wide p1, p0, Lk6/f$a;->a:J

    return-object p0
.end method
