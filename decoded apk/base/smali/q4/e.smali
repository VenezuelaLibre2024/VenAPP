.class public final synthetic Lq4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lq4/e;->a:J

    iput-object p3, p0, Lq4/e;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-wide v0, p0, Lq4/e;->a:J

    iget-object v2, p0, Lq4/e;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lq4/f;->e(JLjava/lang/String;)V

    return-void
.end method