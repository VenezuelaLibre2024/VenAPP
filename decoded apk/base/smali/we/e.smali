.class public final synthetic Lwe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwe/k;

.field public final synthetic b:Lxe/m;

.field public final synthetic c:Lxe/d;


# direct methods
.method public synthetic constructor <init>(Lwe/k;Lxe/m;Lxe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/e;->a:Lwe/k;

    iput-object p2, p0, Lwe/e;->b:Lxe/m;

    iput-object p3, p0, Lwe/e;->c:Lxe/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lwe/e;->a:Lwe/k;

    iget-object v1, p0, Lwe/e;->b:Lxe/m;

    iget-object v2, p0, Lwe/e;->c:Lxe/d;

    invoke-static {v0, v1, v2}, Lwe/k;->f(Lwe/k;Lxe/m;Lxe/d;)V

    return-void
.end method
