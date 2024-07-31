.class public final Lwc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/a$a;
    }
.end annotation


# static fields
.field public static final a:Lkd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwc/a;

    invoke-direct {v0}, Lwc/a;-><init>()V

    sput-object v0, Lwc/a;->a:Lkd/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lkd/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd/b<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lwc/a$a;->a:Lwc/a$a;

    const-class v1, Lwc/i;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lwc/b;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    return-void
.end method
