.class public final synthetic Lx6/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/u$a;

.field public final synthetic b:Lx6/u;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lx6/u$a;Lx6/u;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/q;->a:Lx6/u$a;

    iput-object p2, p0, Lx6/q;->b:Lx6/u;

    iput p3, p0, Lx6/q;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx6/q;->a:Lx6/u$a;

    iget-object v1, p0, Lx6/q;->b:Lx6/u;

    iget v2, p0, Lx6/q;->c:I

    invoke-static {v0, v1, v2}, Lx6/u$a;->f(Lx6/u$a;Lx6/u;I)V

    return-void
.end method
