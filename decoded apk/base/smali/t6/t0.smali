.class public final synthetic Lt6/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/d1;

.field public final synthetic b:Lt6/q1$e;


# direct methods
.method public synthetic constructor <init>(Lt6/d1;Lt6/q1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/t0;->a:Lt6/d1;

    iput-object p2, p0, Lt6/t0;->b:Lt6/q1$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt6/t0;->a:Lt6/d1;

    iget-object v1, p0, Lt6/t0;->b:Lt6/q1$e;

    invoke-static {v0, v1}, Lt6/d1;->q0(Lt6/d1;Lt6/q1$e;)V

    return-void
.end method
