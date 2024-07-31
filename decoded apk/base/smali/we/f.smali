.class public final synthetic Lwe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwe/k;


# direct methods
.method public synthetic constructor <init>(Lwe/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/f;->a:Lwe/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lwe/f;->a:Lwe/k;

    invoke-static {v0}, Lwe/k;->b(Lwe/k;)V

    return-void
.end method
