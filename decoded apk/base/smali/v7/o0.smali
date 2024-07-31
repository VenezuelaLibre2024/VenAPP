.class public final synthetic Lv7/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv7/p0;

.field public final synthetic b:Ly6/z;


# direct methods
.method public synthetic constructor <init>(Lv7/p0;Ly6/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/o0;->a:Lv7/p0;

    iput-object p2, p0, Lv7/o0;->b:Ly6/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/o0;->a:Lv7/p0;

    iget-object v1, p0, Lv7/o0;->b:Ly6/z;

    invoke-static {v0, v1}, Lv7/p0;->w(Lv7/p0;Ly6/z;)V

    return-void
.end method
