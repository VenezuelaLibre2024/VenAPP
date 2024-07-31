.class public final synthetic Lx6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/u$a;

.field public final synthetic b:Lx6/u;


# direct methods
.method public synthetic constructor <init>(Lx6/u$a;Lx6/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/s;->a:Lx6/u$a;

    iput-object p2, p0, Lx6/s;->b:Lx6/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx6/s;->a:Lx6/u$a;

    iget-object v1, p0, Lx6/s;->b:Lx6/u;

    invoke-static {v0, v1}, Lx6/u$a;->c(Lx6/u$a;Lx6/u;)V

    return-void
.end method
