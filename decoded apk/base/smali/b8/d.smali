.class public final synthetic Lb8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lb8/c$c;

.field public final synthetic b:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lb8/c$c;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/d;->a:Lb8/c$c;

    iput-object p2, p0, Lb8/d;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb8/d;->a:Lb8/c$c;

    iget-object v1, p0, Lb8/d;->b:Landroid/net/Uri;

    invoke-static {v0, v1}, Lb8/c$c;->a(Lb8/c$c;Landroid/net/Uri;)V

    return-void
.end method
