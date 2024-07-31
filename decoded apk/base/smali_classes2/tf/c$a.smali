.class public Ltf/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Lee/b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RemoteT:",
            "Ltf/b;",
            ">(",
            "Ljava/lang/Class<",
            "TRemoteT;>;",
            "Lee/b<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltf/c$a;->a:Ljava/lang/Class;

    iput-object p2, p0, Ltf/c$a;->b:Lee/b;

    return-void
.end method


# virtual methods
.method final a()Lee/b;
    .locals 1

    iget-object v0, p0, Ltf/c$a;->b:Lee/b;

    return-object v0
.end method

.method final b()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Ltf/c$a;->a:Ljava/lang/Class;

    return-object v0
.end method
