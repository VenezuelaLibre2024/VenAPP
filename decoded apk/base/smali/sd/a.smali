.class public final synthetic Lsd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingDisplay;


# instance fields
.field public final synthetic a:Lsd/b;

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lsd/b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsd/a;->a:Lsd/b;

    iput-object p2, p0, Lsd/a;->b:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final displayMessage(Lde/i;Lqd/t;)V
    .locals 2

    iget-object v0, p0, Lsd/a;->a:Lsd/b;

    iget-object v1, p0, Lsd/a;->b:Landroid/app/Activity;

    invoke-static {v0, v1, p1, p2}, Lsd/b;->a(Lsd/b;Landroid/app/Activity;Lde/i;Lqd/t;)V

    return-void
.end method
