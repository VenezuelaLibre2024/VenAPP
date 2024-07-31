.class public abstract Lgl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:J

.field public b:Lgl/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    const-wide/16 v0, 0x0

    sget-object v2, Lgl/l;->g:Lgl/i;

    invoke-direct {p0, v0, v1, v2}, Lgl/h;-><init>(JLgl/i;)V

    return-void
.end method

.method public constructor <init>(JLgl/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lgl/h;->a:J

    iput-object p3, p0, Lgl/h;->b:Lgl/i;

    return-void
.end method
