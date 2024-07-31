.class public final synthetic Laf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcf/f;

.field public final synthetic b:Lcf/e;


# direct methods
.method public synthetic constructor <init>(Lcf/f;Lcf/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf/d;->a:Lcf/f;

    iput-object p2, p0, Laf/d;->b:Lcf/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Laf/d;->a:Lcf/f;

    iget-object v1, p0, Laf/d;->b:Lcf/e;

    invoke-static {v0, v1}, Laf/e;->a(Lcf/f;Lcf/e;)V

    return-void
.end method
