.class final Lwg/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lwg/o;

.field private final b:Z


# direct methods
.method constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lwg/l;-><init>(Lwg/o;Z)V

    return-void
.end method

.method constructor <init>(Lwg/o;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lwg/l;->b:Z

    iput-object p1, p0, Lwg/l;->a:Lwg/o;

    return-void
.end method


# virtual methods
.method a()Lwg/o;
    .locals 1

    iget-object v0, p0, Lwg/l;->a:Lwg/o;

    return-object v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lwg/l;->b:Z

    return v0
.end method
