.class public final Lql/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/q$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:Lql/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lql/q$a;

    invoke-direct {v0}, Lql/q$a;-><init>()V

    sput-object v0, Lql/q$a;->a:Lql/q$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
