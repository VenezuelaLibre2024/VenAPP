.class public final synthetic Lwe/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwe/k;

.field public final synthetic b:Lxe/g;

.field public final synthetic c:Lxe/d;


# direct methods
.method public synthetic constructor <init>(Lwe/k;Lxe/g;Lxe/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/i;->a:Lwe/k;

    iput-object p2, p0, Lwe/i;->b:Lxe/g;

    iput-object p3, p0, Lwe/i;->c:Lxe/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lwe/i;->a:Lwe/k;

    iget-object v1, p0, Lwe/i;->b:Lxe/g;

    iget-object v2, p0, Lwe/i;->c:Lxe/d;

    invoke-static {v0, v1, v2}, Lwe/k;->a(Lwe/k;Lxe/g;Lxe/d;)V

    return-void
.end method
