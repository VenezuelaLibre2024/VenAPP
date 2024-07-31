.class final Lcom/android/installreferrer/api/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/installreferrer/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/android/installreferrer/api/InstallReferrerStateListener;

.field final synthetic b:Lcom/android/installreferrer/api/a;


# direct methods
.method private constructor <init>(Lcom/android/installreferrer/api/a;Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
    .locals 0

    iput-object p1, p0, Lcom/android/installreferrer/api/a$b;->b:Lcom/android/installreferrer/api/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/android/installreferrer/api/a$b;->a:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Please specify a listener to know when setup is done."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lcom/android/installreferrer/api/a;Lcom/android/installreferrer/api/InstallReferrerStateListener;Lcom/android/installreferrer/api/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/installreferrer/api/a$b;-><init>(Lcom/android/installreferrer/api/a;Lcom/android/installreferrer/api/InstallReferrerStateListener;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string p1, "InstallReferrerClient"

    const-string v0, "Install Referrer service connected."

    invoke-static {p1, v0}, Lr2/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->b:Lcom/android/installreferrer/api/a;

    invoke-static {p2}, Lw8/a$a;->f2(Landroid/os/IBinder;)Lw8/a;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/installreferrer/api/a;->e(Lcom/android/installreferrer/api/a;Lw8/a;)Lw8/a;

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->b:Lcom/android/installreferrer/api/a;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lcom/android/installreferrer/api/a;->f(Lcom/android/installreferrer/api/a;I)I

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->a:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/android/installreferrer/api/InstallReferrerStateListener;->a(I)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "InstallReferrerClient"

    const-string v0, "Install Referrer service disconnected."

    invoke-static {p1, v0}, Lr2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->b:Lcom/android/installreferrer/api/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/installreferrer/api/a;->e(Lcom/android/installreferrer/api/a;Lw8/a;)Lw8/a;

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->b:Lcom/android/installreferrer/api/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/installreferrer/api/a;->f(Lcom/android/installreferrer/api/a;I)I

    iget-object p1, p0, Lcom/android/installreferrer/api/a$b;->a:Lcom/android/installreferrer/api/InstallReferrerStateListener;

    invoke-interface {p1}, Lcom/android/installreferrer/api/InstallReferrerStateListener;->b()V

    return-void
.end method
