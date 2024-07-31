.class public final synthetic Lx6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/h$f;

.field public final synthetic b:Lt6/u1;


# direct methods
.method public synthetic constructor <init>(Lx6/h$f;Lt6/u1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/j;->a:Lx6/h$f;

    iput-object p2, p0, Lx6/j;->b:Lt6/u1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx6/j;->a:Lx6/h$f;

    iget-object v1, p0, Lx6/j;->b:Lt6/u1;

    invoke-static {v0, v1}, Lx6/h$f;->d(Lx6/h$f;Lt6/u1;)V

    return-void
.end method
