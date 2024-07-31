.class Lvc/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvc/v$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc/p;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lcd/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvc/p;


# direct methods
.method constructor <init>(Lvc/p;)V
    .locals 0

    iput-object p1, p0, Lvc/p$a;->a:Lvc/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcd/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lvc/p$a;->a:Lvc/p;

    invoke-virtual {v0, p1, p2, p3}, Lvc/p;->J(Lcd/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
