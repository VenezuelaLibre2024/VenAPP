.class public final synthetic Lt6/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt6/q1;

.field public final synthetic b:Lt6/m3;


# direct methods
.method public synthetic constructor <init>(Lt6/q1;Lt6/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/p1;->a:Lt6/q1;

    iput-object p2, p0, Lt6/p1;->b:Lt6/m3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt6/p1;->a:Lt6/q1;

    iget-object v1, p0, Lt6/p1;->b:Lt6/m3;

    invoke-static {v0, v1}, Lt6/q1;->f(Lt6/q1;Lt6/m3;)V

    return-void
.end method
